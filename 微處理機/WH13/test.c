#include "AT89X52.H"
sfr LED=0x80; //P0¬°LED¿é¥X
char TABLE[8]={0x01,0x02,0x04,0x08,0x10,0x20,0x40,0x80}; 
main()
{
  loop:
     LED=TABLE[0]; //LED=0x01
		 Delay_ms(100);
     LED=TABLE[1]; //LED=0x02
		 Delay_ms(100);
     LED=TABLE[2]; //LED=0x04
		 Delay_ms(100);
     LED=TABLE[3]; //LED=0x08
		 Delay_ms(100);
     LED=TABLE[4]; //LED=0x10
		 Delay_ms(100);
     LED=TABLE[5]; //LED=0x20
		 Delay_ms(100);
     LED=TABLE[6]; //LED=0x40
		 Delay_ms(100);
     LED=TABLE[7]; //LED=0x80
		 Delay_ms(100);
   goto loop;  
}
