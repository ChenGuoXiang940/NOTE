#include "AT89X52.H"
#include "TABLE8.H"
void main(){
	unsigned char *point;
	point=TABLE;
 loop:
	P0=*point;
	point=point+1;
 goto loop;
}