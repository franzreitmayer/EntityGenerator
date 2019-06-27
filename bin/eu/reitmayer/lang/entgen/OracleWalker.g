tree grammar OracleWalker;

options {
  language = Java;
  output=AST;
  tokenVocab = EntGen;
  ASTLabelType = CommonTree;
}

@header {
package eu.reitmayer.lang.entgen;
}

@members{
	public GlobalContext context = new GlobalContext();
}


prog:
	stat+
	;
	
stat:
	  dom=domain_stat {System.out.println($dom.return_domain.toString());}
	| dae=data_element_stat {System.out.println($dae.return_data_element.toString());}
	| ent=entity_stat {System.out.println($ent.return_entity.toString());}
	;
	
	
domain_stat returns [Domain return_domain]:
	  ^('DOMAIN' ID) { Domain d = context.domains.get($ID.text);
	  if (d == null) {throw new RuntimeException("Domain " + $ID.text + " is undefined");}
	  $return_domain = d;
	  }
	| ^('DOMAIN' i1=ID i2=ID i3=ID) {Domain d = new Domain($i1.text, $i2.text, $i3.text, -1, -1);
		context.domains.put($i1.text, d);
		$return_domain = d;
		}
	| ^('DOMAIN' i1=ID i2=ID i3=ID l=INT) {Domain d = new Domain($i1.text, $i2.text, $i3.text, Integer.parseInt($l.text), -1);
		context.domains.put($i1.text, d);
		$return_domain = d;
		}
	| ^('DOMAIN' i1=ID i2=ID i3=ID l=INT p=INT) {Domain d = new Domain($i1.text, $i2.text, $i3.text, Integer.parseInt($l.text), Integer.parseInt($p.text));
		context.domains.put($i1.text, d);
		$return_domain = d;
		}
	;
	
data_element_stat returns [DataElement return_data_element]:
	   ^('ELEMENT' i1=ID) {DataElement de = context.dataElements.get($i1.text);
	   if (de == null) {throw new RuntimeException("The data element " + $i1.text + " is undefined");}
	   $return_data_element = de;
	   }
	  | ^('ELEMENT' i1=ID dom=domain_stat stext=STRING) {
	  	DataElement de = new DataElement($i1.text, $stext.text, "", "", $dom.return_domain);
	  	context.dataElements.put($i1.text, de);
	  	$return_data_element = de;
	  }
	  | ^('ELEMENT' i1=ID dom=domain_stat stext=STRING mtext=STRING){
	  	DataElement de = new DataElement($i1.text, $stext.text, $mtext.text, "", $dom.return_domain);
	  	context.dataElements.put($i1.text, de);
	  	$return_data_element = de;
	  }
	  | ^('ELEMENT' i1=ID dom=domain_stat stext=STRING mtext=STRING ltext=STRING){
	  	DataElement de = new DataElement($i1.text, $stext.text, $mtext.text, $ltext.text, $dom.return_domain);
	  	context.dataElements.put($i1.text, de);
	  	$return_data_element = de;
	  }
	;
	
entity_element_stat:
	data_element_stat
	| ^('KEY' data_element_stat)
	;

entity_stat returns[Entity return_entity]:
	^('ENTITY' i1=ID) {Entity e = context.entities.get($i1.text);
	if (e==null) {throw new RuntimeException("The entity" + $i1.text + " is not defined");}
	$return_entity = e;
	}
	| ^('ENTITY' i1=ID dae+=data_element_stat+) {Entity e = new Entity($i1.text, $dae, context);
	context.entities.put($i1.text, e);
	$return_entity = e;
	}
	;
	
