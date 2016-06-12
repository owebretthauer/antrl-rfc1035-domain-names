grammar Domain;

@header {
package education.explore.antlr.rfc1035;
}

/* https://www.ietf.org/rfc/rfc1035.txt */

domain : subdomain  ;
subdomain : label | subdomain '.' label;

label : LETTER (ldh_str | let_dig)?;
ldh_str : let_dig_hyp | (let_dig_hyp ldh_str);
let_dig_hyp : let_dig | '-';
let_dig : LETTER | DIGIT;

LETTER : ('a'..'z' | 'A'..'Z');
DIGIT : ('0'..'9');

