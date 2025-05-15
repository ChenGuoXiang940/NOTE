#include "at89x52.h"
sfr Data=0x80;
sfr Scan=0x90;
void main(){
	Scan=0x7f;
	while(1){
		Data=0;
		Delay_ms(50);
		Data=0xff;
		Scan=RR8(Scan);
	}
}