sfr P0=0x80;
sfr P1=0x90;
void test1(void){
	static char i=10;
	i=i+1;
	P0=i;
}
void test2(void){
	char j=10;
	j=j+1;
	P1=j;
}
void main(){
	loop:
		test1();
		test2();
	goto loop;
}