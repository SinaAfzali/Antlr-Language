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
var_definition: (('var'  (ArgumentName | ClassName) ( TYPE)? (EQUAL (STRING | Numbers| ClassName| ArgumentName| func_call))? ) | 
('var'  (ArgumentName | ClassName) (COMMA (ArgumentName | ClassName))* TYPE? EQUAL (STRING | Numbers| ClassName| ArgumentName| func_call) (COMMA (STRING | Numbers| ClassName| ArgumentName| func_call))*) | 
((ArgumentName | ClassName) (COMMA (ArgumentName | ClassName))* EQUAL ':' (STRING | Numbers| ClassName| ArgumentName| func_call) (COMMA (STRING | Numbers| ClassName| ArgumentName| func_call))*) | 
('var' '(' (ArgumentName | ClassName)  TYPE (EQUAL (STRING | Numbers| ClassName| ArgumentName| func_call))? (NEWLINE (ArgumentName | ClassName)  TYPE (EQUAL (STRING | Numbers| ClassName| ArgumentName| func_call))?)* ')' ) );


arr_definition: ( ('var' (ArgumentName | ClassName) EQUAL '[' (Numbers | '...') ']' TYPE '{' (STRING | Numbers) (COMMA (STRING | Numbers))* '}') |
((ArgumentName | ClassName) EQUAL ':' '[' (Numbers | '...') ']' TYPE '{' (STRING | Numbers) (COMMA (STRING | Numbers))* '}') );

class_definition: 'class' ClassName ('extends' ClassName)? ':' NEWLINE TABE ('public' | 'private')
ClassName '(' (TYPE (ArgumentName | ClassName))* ')' ':'  (NEWLINE TABE 'this.' (ArgumentName | ClassName) EQUAL (ArgumentName | ClassName))*
(NEWLINE* (TABE (var_definition | arr_definition | func_definition | calls | instructions| operator)))*;

func_definition: ('public' | 'private') 'static'? ('void' | TYPE) (ArgumentName | ClassName) '(' (TYPE (ArgumentName | ClassName))? (COMMA TYPE (ArgumentName | ClassName))* ')' ':'
(NEWLINE TABE (var_definition | arr_definition | func_call| instructions| operator| returnFunc))+;


// part of calls 
func_call: ((ClassName Dot (ArgumentName | ClassName) '(' ((ArgumentName | ClassName| operator| Numbers| STRING) (COMMA (ArgumentName | ClassName| operator| Numbers| STRING))*)? ')') | 
((ArgumentName | ClassName) '(' ((ArgumentName | ClassName| operator| Numbers| STRING) (COMMA (ArgumentName | ClassName| operator| Numbers| STRING))*)? ')'));


// part of instructions
if_statement: 'if' (operator|STRING|ArgumentName|ClassName|Numbers)+ ':' (NEWLINE TABE (arr_definition | var_definition | calls | instructions| operator| returnFunc))+ NEWLINE* TABE?
('elif' (operator|STRING|ArgumentName|ClassName|Numbers)+ ':' (NEWLINE TABE (arr_definition | var_definition | calls | instructions| operator| returnFunc))+) NEWLINE* TABE?
('else' ':' (NEWLINE TABE (arr_definition | var_definition | calls | instructions| operator| returnFunc))+)?; 


matchCase_instruction: 'match' (ArgumentName | ClassName) ':' 
(NEWLINE TABE 'case' (Numbers|STRING) ':' (NEWLINE TABE ('return'|operator|STRING|ArgumentName|ClassName| returnFunc)+)+ 'break'?)+
(NEWLINE TABE 'default' ':' (NEWLINE TABE ('return'|operator|STRING|ArgumentName|ClassName)| returnFunc+)+ 'break'?)?;

while_loop: 'while' (operator|STRING|('=')+ |ArgumentName|ClassName|Numbers)+ ':' (NEWLINE TABE (arr_definition | var_definition | calls | instructions| operator| returnFunc))+ ;

for_loop:('for' (ArgumentName | ClassName| STRING) 'in' (ArgumentName|ClassName| STRING) ':' (NEWLINE TABE (arr_definition | var_definition | calls | instructions| operator| returnFunc))+ ) |
('for' (ArgumentName|ClassName) 'in' 'range' '(' (ArgumentName|ClassName|Numbers) ')' ':' (NEWLINE TABE (arr_definition | var_definition | calls | instructions| operator| returnFunc))+ );

readFile: (ArgumentName|ClassName) EQUAL 'open' '(' '"' (WORD+ | ArgumentName | ClassName) Dot 'txt' '"' COMMA ('"r"' | '"w"' ) ')';

writeFile: (ArgumentName|ClassName) Dot 'write' '(' STRING ')';

closeFile:(ArgumentName|ClassName) Dot 'close()';

returnFunc: ('return' (STRING| Numbers | ClassName| ArgumentName| operator));






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



operator: operator ('//=' | '+=' | '=') b | b;
b: b ('&&' | '||') c | '!'b | c;
c: c ('>=' | '<=' | '<' | '>') d | d;
d: d ('==' | '===' | '!=') e | e;
e: e ('&' | '|') f | f;
f: f ('<<' | '>>') g | g;
g: g ('+' | '-') h | h;
h: h ('*' | '/' | '//' | '%') i | i;
i: i ('++' | '--') | ('++' | '--') i | j;
j: ('-' | '+') j | k;
k: k '**' l | l;
l: '(' operator ')' | m;
m: ArgumentName | ClassName | Numbers| STRING; 


WHITE_SPACE: (' '|'\r') -> skip;
