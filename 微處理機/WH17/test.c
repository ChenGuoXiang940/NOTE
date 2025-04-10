#include "AT89X52.H"
#include "TABLE16.H"
void main(){
	unsigned char i=0;
	loop:
		P0=TABLE[i];
		P1=TABLE[i]>>8;
		i++;
		Delay_ms(100);
	goto loop;
}