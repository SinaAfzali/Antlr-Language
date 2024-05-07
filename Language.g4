grammar Language;

start: imports;
// imports library
imports: (('use' SPACE ArgumentName ('::' ArgumentName)? (SPACE 'as' SPACE ArgumentName)? NEWLINE) | ('extern' SPACE 'crate' SPACE ArgumentName) NEWLINE)* commands;
// commands contains a body of codes
commands: definitions | calls | instructions;
// part of commands


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
