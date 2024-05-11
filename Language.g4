grammar Language;

start: imports* commands;
// imports library
imports: (('use' SPACE ArgumentName ('::' ArgumentName)? (SPACE 'as' SPACE ArgumentName)? NEWLINE) | ('extern' SPACE 'crate' SPACE ArgumentName) NEWLINE);
// commands contains a body of codes
commands: definitions | calls | instructions;
// part of commands
definitions:  var_definition | arr_definition | class_definition | func_definition;
calls: func_call;
instructions: if_statement | matchCase_instruction | while_loop | for_loop | readFile | writeFile;

// part of definitions


fragment CapitalLetter: [A-Z];
fragment SmallLetter: [a-z];
fragment Number: [0-9];

SPACE: ' ';
NEWLINE: '\n';
TABE: '\t';
KEYWORD: 'extern' | 'crate' | 'use' | 'as' | 'var' | 'if' | 'elif' | 'else' | 'while' | 
'for' | 'in' | 'range' | 'match'| 'case' | 'break' | 'default' | 'class' | 'extends' | 'public' |
'private' | 'static' | 'return' | 'open' | 'txt' | 'write'| 'close';

WORD: (CapitalLetter | SmallLetter | '_' | '$' | Number);

ArgumentName: (CapitalLetter | SmallLetter) (WORD+);


// WHITE_SPACE: (' '|'\n'|'\t'|'\r') -> skip;
