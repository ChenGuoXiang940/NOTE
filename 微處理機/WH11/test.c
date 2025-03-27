#include "AT89X52.H"
#include "TABLE8.H"
sfr LED=0x80;
void main(){
	unsigned char i=0;
	loop:
		LED=TABLE[i];
		i=i+1;
		Delay_ms(100);
	goto loop;
}