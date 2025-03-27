unsigned int TABLE[8]={0X01,0X02,0X04,0X08,0X10,0X20,0X40,0X80};
sfr LED=0x80;
void main(){
	loop:
		LED=TABLE[0];
		LED=TABLE[1];
		LED=TABLE[2];
		LED=TABLE[3];
		LED=TABLE[4];
		LED=TABLE[5];
		LED=TABLE[6];
		LED=TABLE[7];
		LED=TABLE[8];
		LED=TABLE[9];
	goto loop;
}