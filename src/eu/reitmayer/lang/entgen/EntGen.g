grammar EntGen;

options {
  language = Java;
  output = AST;
}

@header{
package eu.reitmayer.lang.entgen;
}

@lexer::header{
package eu.reitmayer.lang.entgen;
}

prog:
	s+=stat+
	;
	
stat:
	  domain_stat ';'  -> domain_stat
	 | data_element_stat ';' -> data_element_stat
	 | entity_stat ';' -> entity_stat
	;
	
domain_stat:
	   'DOMAIN' ID -> ^('DOMAIN' ID)
	 | 'DOMAIN' ID 'JTYPE' ID 'DBTYPE' ID  -> ^('DOMAIN' ID ID ID)
	 | 'DOMAIN' ID 'JTYPE' ID 'DBTYPE' ID 'LENGTH' INT -> ^('DOMAIN' ID ID ID INT)
	 | 'DOMAIN' ID 'JTYPE' ID 'DBTYPE' ID 'LENGTH' INT 'PRECISION' INT -> ^('DOMAIN' ID ID ID INT INT)
	;
	
data_element_stat:
	   'ELEMENT' ID -> ^('ELEMENT' ID)
	  | 'ELEMENT' ID d=domain_stat 'STEXT' STRING -> ^('ELEMENT' ID $d STRING)
	  | 'ELEMENT' ID d2=domain_stat 'STEXT' STRING 'MTEXT' STRING -> ^('ELEMENT' ID $d2 STRING STRING)
	  | 'ELEMENT' ID d3=domain_stat 'STEXT' STRING 'MTEXT' STRING 'LTEXT' STRING -> ^('ELEMENT' ID $d3 STRING STRING STRING)
	;

entity_element_stat:
	data_element_stat -> data_element_stat
	| 'KEY' data_element_stat -> ^('KEY' data_element_stat)
	;
	
entity_stat:
	'ENTITY' ID -> ^('ENTITY' ID)
	|'ENTITY' ID '('
		de+=entity_element_stat (',' de+=entity_element_stat)* ')' -> ^('ENTITY' ID $de+) 
		
	;
	
	

/* ----------------------------------------------------------------------------
   lexer section
   ------------------------------------------------------------------------- */


ML :
  '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;};

SL_COMMENT :
  '//' (~('\n'|'\r'))* ('\n'|'\r'('\n')?)? {$channel=HIDDEN;}; 


// fragments
fragment
Digit :
  '0'..'9';
  
fragment
Letter :
  'a'..'z' |
  'A'..'Z';
  


// whitespace
WS :
  (' ' | '\t' | '\f' | '\n' | '\r')+ {$channel=HIDDEN;};

  




// define identifiers
ID :
  Letter (Letter | Digit | '_' )*;
  
// define integers  
INT :
  Digit Digit*; 
  
// define string
STRING :
  '"' (~('"'|'\n'|'\r'))* '"';