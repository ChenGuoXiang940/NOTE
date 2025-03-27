sfr T2=0xCC;
void main(){
	unsigned int i=0x12fe;
 loop:
	T2=i;
	i=i+1;
 goto loop;
}