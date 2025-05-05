#include "AT89X52.H"
void main(){
	char hor=23;
	char min=58;
	char sec=52;
 loop:
	P0=(sec/10<<4)+(sec%10);
	P1=(min/10<<4)+(min%10);
	P2=(hor/10<<4)+(hor%10);
	Delay_ms(100);
	sec++;
	if(sec==60){
		sec=0;
		min++;
		if(min==60){
			min=0;
			hor++;
			if(hor==24){
				hor=0;
				min=0;
				sec=0;
			}
			else goto loop;
		}else goto loop;
	}goto loop;
}