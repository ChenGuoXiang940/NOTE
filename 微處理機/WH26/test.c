#include "AT89X52.H"
sfr LED=0x80;
void main(){
	unsigned char i;
	unsigned char j=0x01;
	for(;;){
		for(i=0;i<8;i++){
			LED=j;
			Delay_ms(100);
			j=j<<1;
		}
		for(i=0;i<8;i++){
			LED=j;
			Delay_ms(100);
			j=j>>1;
		}
	}
}