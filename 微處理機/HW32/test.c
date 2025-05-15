#include "AT89X52.H"
sfr Data=0x80;
sbit speak=P2^6;
sbit SSLED0=0x90;
sbit SSLED1=0x91;
sbit SSLED2=0x92;
sbit SSLED3=0x93;
code char r_table[]={0x01,0x02,0x04,0x08};
code unsigned char Table[]={0x3f,0x06,0x5b,0x4f,0x66,0x6d,0x7d,0x07,0x7f,0x6f};
void Display(int,char);
void beep(unsigned char);
void main(){
	int step=9990;
	char scan=10;
	char i=0;
	while(1){
		Display(step,scan);
		if(step==9999){
			beep(3);
			step = 0;
		}
		else{
				step++;
		}
	}
}
void Display(int step,char scan){
	unsigned char i;
	while(scan--){
		SSLED0=SSLED1=SSLED2=SSLED3=1;
		i=step%10;
		Data=~Table[i];
		SSLED0=0;
		Delay_ms(1);
		
		SSLED0=SSLED1=SSLED2=SSLED3=1;
		i=(step%100)/10;
		Data=~Table[i];
		SSLED1=0;
		Delay_ms(1);
		
		SSLED0=SSLED1=SSLED2=SSLED3=1;
		i=(step%1000)/100;
		Data=~Table[i];
		SSLED2=0;
		Delay_ms(1);
		
		SSLED0=SSLED1=SSLED2=SSLED3=1;
		i=(step%10000)/1000;
		Data=~Table[i];
		SSLED3=0;
		Delay_ms(1);
		}
}
void beep(unsigned char i){
	unsigned char j;
	while(i--){
		for(j=0;j<123;j++){
			speak=!speak;
			Delay_ms(2);
		}
		Delay_ms(200);
		Display(9999,10);
	}
}