#include "at89x52.h"
#include "font.h"
sfr Data=0x80;
sfr Scan=0x90;
void main(){
	unsigned char i;
	unsigned char repeat;
	unsigned char boo;
	unsigned char mask;
	Scan=0x7f;
	while(1){
		mask=0xff;
		for(boo=0;boo<8;boo++){
			for(repeat=0;repeat<20;repeat++){
				for(i=0;i<8;i++){
					Data=font[i]|mask;
					Delay_ms(1);
					Data=0xff;
					Scan=RR8(Scan);
				}
			}
			mask=mask<<1;
		}
	}
}