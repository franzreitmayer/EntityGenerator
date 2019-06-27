tree grammar OracleEmmiter;

options {
  language = Java;
  output = template;
  tokenVocab = OracleWalker;
  ASTLabelType = CommonTree;
}


@header{
package eu.reitmayer.lang.entgen;
}

@members{
public GlobalContext context = new GlobalContext();
}



prog:
	st+=stat+ -> delegate_strings(sl={$st})
	;
	
stat:
	  domain_stat 
	| data_element_stat 
	| entity_stat -> delegate_string(s={$entity_stat.st})
	;
	
domain_stat:
	  ^('DOMAIN' ID) -> type_def(t={context.domains.get($ID.text).getSQLText()})
	| ^('DOMAIN' i1=ID i2=ID i3=ID) -> type_def(t={$i3.text})
	| ^('DOMAIN' i1=ID i2=ID i3=ID l=INT) -> type_def_length(t={$i3.text}, l={$l})
	| ^('DOMAIN' i1=ID i2=ID i3=ID l=INT p=INT) -> type_def_length_precision(t={$i3.text}, l={$l}, p={$p})
	;
	
data_element_stat:
	   ^('ELEMENT' i1=ID) -> delegate_string(s={$i1.text + " " + context.dataElements.get($ID.text).getDomain().getSQLText()} )
	  | ^('ELEMENT' i1=ID dom=domain_stat stext=STRING) -> delegate_string(s={$i1.text + " " + $dom.st})
	  | ^('ELEMENT' i1=ID dom=domain_stat stext=STRING mtext=STRING) -> delegate_string(s={$i1.text + " " + $dom.st})
	  | ^('ELEMENT' i1=ID dom=domain_stat stext=STRING mtext=STRING ltext=STRING) -> delegate_string(s={$i1.text + " " + $dom.st})
	;
	
entity_stat:
	^('ENTITY' i1=ID)
	| ^('ENTITY' i1=ID dae+=data_element_stat+) -> create_table(table_id = {$i1.text}, elems={$dae})
	;
	
	
