sfr P1=0x90;
sbit P1_0=P1^1;
void main(){
	char a=-3,b=0,c=5;
	unsigned char d=0x0f;
	static char i;
	loop:
		i=-a;
		i=-c;
		P1_0=!P1_0;// ! �O�D�s�ȡA��ܡu�u�v
		i=!b;
		i=!c;
		P1=~d;// ~ ��ɽX
	goto loop;
}