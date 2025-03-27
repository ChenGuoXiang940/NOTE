sfr P0=0x80;
sfr P1=0x90;
sfr P2=0xA0;
sfr P3=0xB0;
void main(){
	unsigned char i=0;
 loop:
  P0=P1=P2=P3=i;
	i=i+1;
 goto loop;
}