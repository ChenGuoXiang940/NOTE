#include "AT89X52.H"
sfr LED=0x80;
void main(){
	char i=1;
 loop:
	LED=i;
	i++;
	if(i>7)i=1;
 goto loop;
}