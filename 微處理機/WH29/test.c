#include "at89x52.h"
sbit KEY=P3^2;
sbit SPEAK=P2^6;
// void beep(unsigned char);
void main(){
	unsigned char dly=1;
	while(1){
		SPEAK=!SPEAK;
		Delay_ms(dly);
		if(KEY==0)dly++;
	}
}
/*
void beep(unsigned char i){
	unsigned char j;
	while(i--){
		for(j=0;j<400;++j){
			SPEAK=!SPEAK;
			Delay_ms(1);
		}
		Delay_ms(200);
	}
}
*/