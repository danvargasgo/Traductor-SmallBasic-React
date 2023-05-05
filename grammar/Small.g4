grammar Small;

p : su p EOF | s p EOF |;

su: SUB ID susl ENDSUB;
susl: s susl | ;

s: c | f | w | bf | id | GOTO ID;

id: ID id1;
id1: va | COLON | LEFT_PAREN RIGHT_PAREN | ;

va: va_op_dim EQUALS ex;
va_op_dim: LEFT_BRAC ex RIGHT_BRAC va_op_dim | ;

c: IF LEFT_PAREN ex RIGHT_PAREN THEN csl c1;
c1: ENDIF | ELSEIF LEFT_PAREN ex RIGHT_PAREN THEN csl c1 | ELSE csl ENDIF;
csl: s csl | ;

f: FOR ID va TO ex st fsl ENDFOR;
st: STEP st1 | ;
st1: MINUS es | es ;
fsl: s fsl | ;

w: WHILE LEFT_PAREN ex RIGHT_PAREN wsl ENDWHILE;
wsl: s wsl | ;

bf: rw PERIOD ID LEFT_PAREN pam RIGHT_PAREN;
pam: pal | ;
pal: pa pal1;
pal1: COMMA pa pal1 | ;
pa: ex | ;
rw: TEXT_WINDOW | STACK | PROGRAM | ARRAY ;

ex: MINUS eb ex1 | eb ex1;
ex1: OR eb ex1 | ;
eb: er eb1;
eb1: AND er eb1 | ;
er: es er1;
er1: ro es | ;
ro: LESS | GREATER | EQUALS | LEQ | GEQ | DIFF;
es: em es1;
es1: so em es1 | ;
so: PLUS | MINUS;
em: d em1;
em1: mo d em1 | ;
mo: TIMES | DIV;

d: STR | TRUE | FALSE | NUM | ID id_op_dim | LEFT_PAREN ex RIGHT_PAREN | bf;
id_op_dim: LEFT_BRAC ex RIGHT_BRAC id_op_dim | ;

// Ignorar espacios en blanco, tabulaciones, saltos de línea y retornos de carro.
WS: [ \t\r\n]+ -> skip;
// Comentarios de una línea. Estos comienzan con ' y terminan con un salto de línea.
LINE_COMMENT : '\'' ~[\r\n]* -> skip;
ELSEIF: 'ElseIf';
ENDIF: 'EndIf';
ENDWHILE: 'EndWhile';
ENDFOR: 'EndFor';
ENDSUB: 'EndSub';
GOTO: 'Goto';
IF: 'If';
THEN: 'Then';
ELSE: 'Else';
WHILE: 'While';
FOR: 'For';
SUB: 'Sub';
TO: 'To';
STEP: 'Step';
TRUE: 'True';
FALSE: 'False';
TEXT_WINDOW: 'TextWindow';
STACK: 'Stack';
PROGRAM: 'Program';
ARRAY: 'Array';
OR: 'Or';
AND: 'And';
COLON: ':';
MINUS: '-';
PLUS: '+';
TIMES: '*';
DIV: '/';
COMMA: ',';
PERIOD: '.';
LESS: '<';
GREATER: '>';
EQUALS: '=';
LEQ: '<=';
GEQ: '>=';
DIFF: '<>';
LEFT_BRAC: '[';
RIGHT_BRAC: ']';
LEFT_PAREN: '(';
RIGHT_PAREN: ')';
STR: '"'.*?'"';
NUM: [0-9]+('.'[0-9]*)?;
// ID debe comenzar por una letra (ya sea mayúscula o minúscula); después de ello puede contener solamente números, guiones bajos (“_”) y más letras. Además, reconoce carácteres como eñes, tildes, diéresis y cedillas.
ID: [a-zA-ZáéíóúÁÉÍÓÚñÑüÜçÇ][a-zA-ZáéíóúÁÉÍÓÚñÑüÜçÇ0-9_]*;
