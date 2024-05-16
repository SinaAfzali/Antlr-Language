grammar Language;

start: (imports NEWLINE+)* (commands NEWLINE+)*;
// imports library
imports: ('use' (ArgumentName | ClassName) ('::' (ArgumentName | ClassName))? ('as'  (ArgumentName | ClassName))? ) | ('extern'  'crate'  (ArgumentName | ClassName));
// commands contains a body of codes
commands: definitions | calls | instructions;
// part of commands
definitions:  var_definition | arr_definition | class_definition | func_definition;
calls: func_call;
instructions: if_statement | matchCase_instruction | while_loop | for_loop | readFile | writeFile | closeFile;


// part of definitions
var_definition: (('var'  (ArgumentName | ClassName) ( TYPE)? (EQUAL (STRING | Numbers))? ) | 
('var'  (ArgumentName | ClassName) (COMMA (ArgumentName | ClassName))* TYPE? EQUAL (STRING | Numbers) (COMMA (STRING | Numbers))*) | 
((ArgumentName | ClassName) (COMMA (ArgumentName | ClassName))* EQUAL ':' (STRING | Numbers) (COMMA (STRING | Numbers))*) | 
('var' '(' (ArgumentName | ClassName)  TYPE (EQUAL (STRING | Numbers))? (NEWLINE (ArgumentName | ClassName)  TYPE (EQUAL (STRING | Numbers))?)* ')' ) );


arr_definition: ( ('var' (ArgumentName | ClassName) EQUAL '[' (Numbers | '...') ']' TYPE '{' (STRING | Numbers) (COMMA (STRING | Numbers))* '}') |
((ArgumentName | ClassName) EQUAL ':' '[' (Numbers | '...') ']' TYPE '{' (STRING | Numbers) (COMMA (STRING | Numbers))* '}') );

class_definition: 'class' ClassName ('extends' ClassName)? ':' NEWLINE TABE ('public' | 'private')
ClassName '(' (TYPE (ArgumentName | ClassName))* ')' ':'  (NEWLINE TABE 'this.' (ArgumentName | ClassName) EQUAL (ArgumentName | ClassName))*
(NEWLINE* (TABE (var_definition | arr_definition | func_definition | calls | instructions)))*;

func_definition: ('public' | 'private') 'static'? ('void' | TYPE) (ArgumentName | ClassName) '(' (TYPE (ArgumentName | ClassName))* ')' ':'
(NEWLINE TABE (var_definition | arr_definition | func_call| instructions))+;


// part of calls 
func_call: ((ClassName Dot (ArgumentName | ClassName) '(' ((ArgumentName | ClassName) (COMMA (ArgumentName | ClassName))*)? ')') | 
((ArgumentName | ClassName) '(' ((ArgumentName | ClassName) (COMMA (ArgumentName | ClassName))*)? ')'));


// part of instructions
if_statement: 'if' (PHRASE|STRING|EQUAL+ |ArgumentName|ClassName|Numbers)+ ':' (NEWLINE TABE (arr_definition | var_definition | calls | instructions))+ NEWLINE+ 
('elif' (PHRASE|STRING|('=')+ |ArgumentName|ClassName|Numbers)+ ':' (NEWLINE TABE (arr_definition | var_definition | calls | instructions))+)* NEWLINE+
('else' ':' (NEWLINE TABE (arr_definition | var_definition | calls | instructions))+)?; 


matchCase_instruction: 'match' (ArgumentName | ClassName) ':' 
(NEWLINE TABE 'case' (Numbers|STRING) ':' (NEWLINE TABE ('return'|PHRASE|STRING|ArgumentName|ClassName)+)+ 'break'?)+
(NEWLINE TABE 'default' ':' (NEWLINE TABE ('return'|PHRASE|STRING|ArgumentName|ClassName)+)+ 'break'?)?;

while_loop: 'while' (PHRASE|STRING|('=')+ |ArgumentName|ClassName|Numbers)+ ':' (NEWLINE TABE (arr_definition | var_definition | calls | instructions))+ ;

for_loop:('for' (ArgumentName | ClassName) 'in' (ArgumentName|ClassName) ':' (NEWLINE TABE (arr_definition | var_definition | calls | instructions))+ ) |
('for' (ArgumentName|ClassName) 'in' 'range' '(' (ArgumentName|ClassName|Numbers) ')' ':' (NEWLINE TABE (arr_definition | var_definition | calls | instructions))+ );

readFile: (ArgumentName|ClassName) EQUAL 'open' '(' '"' (WORD+ | ArgumentName | ClassName) Dot 'txt' '"' COMMA ('"r"' | '"w"' ) ')';

writeFile: (ArgumentName|ClassName) Dot 'write' '(' STRING ')';

closeFile:(ArgumentName|ClassName) Dot 'close()';


fragment CapitalLetter: [A-Z];
fragment SmallLetter: [a-z];
fragment Number: [0-9];

// Special chars
NEWLINE: '\n';
TABE: '\t';
EQUAL: '=';
COMMA: ',';
Dot: '.';


KEYWORD: 'extern' | 'crate' | 'use' | 'as' | 'var' | 'if' | 'elif' | 'else' | 'while' | 
'for' | 'in' | 'range' | 'match'| 'case' | 'break' | 'default' | 'class' | 'extends' | 'public' |
'private' | 'static' | 'return' | 'open' | 'txt' | 'write'| 'close' | 'this';

TYPE: 'int' | 'string';

Numbers: Number+;

WORD: (CapitalLetter | SmallLetter | '_' | '$' | Number);

ClassName: CapitalLetter WORD+;

ArgumentName: (CapitalLetter | SmallLetter) WORD+;

STRING: '"' WORD+ '"';

PHRASE: (WORD | '!' | '<' | '>'| '&' | '|' | '%' | '*' | '/'|'+'|'-')+;

WHITE_SPACE: (' '|'\r') -> skip;
