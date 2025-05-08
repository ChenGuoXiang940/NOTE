#include "at89x52.h"
void main(){
	unsigned int i=0x0001;
	unsigned int j=0x8000;
 loop:
	P0=i>>8;
	P1=i;
	P2=j>>8;
	P3=j;
	Delay_ms(1000);
	i=RL16(i);
	j=RR16(j);
	goto loop;
}