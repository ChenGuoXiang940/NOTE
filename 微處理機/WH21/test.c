#include "AT89X52.H"
sfr LED=0x80;
main()
{       
   char i=0;
 loop:
   LED=(i/10<<4)+(i%10);
   i++;
	 Delay_ms(100);
   if(i<100)goto loop;
   i=0;
   goto loop; 
}
