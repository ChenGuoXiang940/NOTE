#include "AT89X52.H"
void test(){
	static char i=10;
	i=i+1;
	P0=i;
}
void main(){
	loop:
		test();
	goto loop;
}