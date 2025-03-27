sfr P1=0x90;
sbit P10=0x90;
sbit P11=0x90^1;
sbit P12=0x90^2;
void main(){
 loop:
	P10=P11=P12=0;
	P10=P11=P12=1;
 goto loop;
}