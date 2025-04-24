#include "AT89X52.H"
main()
{       
   char hor=23,min=58,sec=52;
 loop:
   P0=(sec/10<<4)+(sec%10);
   P1=(min/10<<4)+(min%10);
   P2=(hor/10<<4)+(hor%10);
   Delay_ms(100);
   sec++;
   if(sec < 60) goto loop;
   sec=0; min++;
   if(min < 60) goto loop;
   min=0; hor++;
   if(hor <24) goto loop;
   hor=0;min=0; sec=0;
  goto loop;
}
