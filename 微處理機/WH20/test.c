#include "AT89X52.H"
#include "TABLE8.H"
sfr LED=0x80;
void main(){
	unsigned char *point;
	point=TABLE;
 loop:
	LED=*point;
	point=point+1;
	if(point>(TABLE+255))point=TABLE;
	Delay_ms(100);
 goto loop;
}