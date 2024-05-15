grammar Language;

start: (imports NEWLINE+)* (commands NEWLINE+)*;
// imports library
imports: ('use' (ArgumentName | ClassName) ('::' (ArgumentName | ClassName))? ('as'  (ArgumentName | ClassName))? ) | ('extern'  'crate'  (ArgumentName | ClassName));
// commands contains a body of codes
commands: definitions | calls;
// part of commands
definitions:  var_definition | arr_definition | class_definition | func_definition;
calls: func_call;
// instructions: if_statement | matchCase_instruction | while_loop | for_loop | readFile | writeFile;

// part of definitions
var_definition: (('var'  (ArgumentName | ClassName) ( TYPE)? (EQUAL (STRING | Numbers))? ) | 
('var'  (ArgumentName | ClassName) (COMMA (ArgumentName | ClassName))* TYPE? EQUAL (STRING | Numbers) (COMMA (STRING | Numbers))*) | 
((ArgumentName | ClassName) (COMMA (ArgumentName | ClassName))* EQUAL ':' (STRING | Numbers) (COMMA (STRING | Numbers))*) | 
('var' '(' (ArgumentName | ClassName)  TYPE (EQUAL (STRING | Numbers))? (NEWLINE (ArgumentName | ClassName)  TYPE (EQUAL (STRING | Numbers))?)* ')' ) );


arr_definition: ( ('var' (ArgumentName | ClassName) EQUAL '[' (Numbers | '...') ']' TYPE '{' (STRING | Numbers) (COMMA (STRING | Numbers))* '}') |
((ArgumentName | ClassName) EQUAL ':' '[' (Numbers | '...') ']' TYPE '{' (STRING | Numbers) (COMMA (STRING | Numbers))* '}') );

class_definition: 'class' ClassName ('extends' ClassName)? ':' NEWLINE TABE ('public' | 'private')
ClassName '(' (TYPE (ArgumentName | ClassName))* ')' ':'  (NEWLINE TABE 'this.' (ArgumentName | ClassName) EQUAL (ArgumentName | ClassName))*
NEWLINE* (TABE (var_definition | arr_definition | func_definition | calls ))*;

func_definition: ('public' | 'private') 'static'? ('void' | TYPE) (ArgumentName | ClassName) '(' (TYPE (ArgumentName | ClassName))* ')' ':'
(NEWLINE TABE? (var_definition | arr_definition | func_call))+;


// part of calls 
func_call: ((ClassName Dot (ArgumentName | ClassName) '(' ((ArgumentName | ClassName) (COMMA (ArgumentName | ClassName))*)? ')') | 
((ArgumentName | ClassName) '(' ((ArgumentName | ClassName) (COMMA (ArgumentName | ClassName))*)? ')'));


// part of instructions
// if_statement: 


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

STRING: '"' (WORD | '!' | '#' | '&' | '|' | '*' | '-' | '+' | '[' | ']' | '{' | '}')+ '"';

WHITE_SPACE: (' '|'\r') -> skip;
