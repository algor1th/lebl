grammar Grammar;
brain: 'name' IDENTIFIER ';' block+ EOF;
block:
    'block' IDENTIFIER '{'(statement';')+'}'
     ;
statement: (label)|(instruction|inline);
instruction :
             mark
             | unmark
             | set
             | unset
             | test
             | sense
             | move
             | pickup
             | drop
             | flip
             | breed
             | jump
             | direction
             | turn
             ;

mark :
    'mark'  NUMBER ;

unmark :
    'unmark'  NUMBER ;

set :
    'set'  NUMBER ;

unset :
    'unset'  NUMBER ;

test :
    'test'  reg=NUMBER  'else'  alt=label ;


sense :
    'sense' SENSE_DIR SENSE_TARGET ( mbm=NUMBER)?
    'else'
    alt=label ;

move : 'move'  'else'  label ;

pickup : 'pickup'  'else'  label ;

drop : 'drop'  'else'  label ;

flip : 'flip'  max=NUMBER  'else'  alt=label ;

breed : 'breed'  'else'  label ;

jump : 'jump'  label ;

direction : 'direction'  DIR_DIR  'else'  label ;

turn : 'turn'  SENSE_DIR ;

inline: 'inline' IDENTIFIER;

SENSE_DIR
  :
    'left'
  | 'right'
  | 'ahead'
  | 'here'
  ;

SENSE_TARGET
  :
    'marker'
  | 'friend'
  | 'foe'
  | 'food'
  | 'rock'
  | 'home'
  | 'foehome'
  | 'antlion'
  | 'foemarker'
  | 'friendfood'
  | 'foefood'
  ;

DIR_DIR
  :
    'northeast'
  | 'northwest'
  | 'west'
  | 'southwest'
  | 'southeast'
  | 'east'
  ;

NUMBER : [0-9]+;
IDENTIFIER : [a-zA-Z_.-][a-zA-Z0-9_.-]+;
label: '$'IDENTIFIER;
WS: [ \t\n\r] -> skip;