#include "AT89X52.H"
// 位元變數
bit clrbit;
bit setbit;

// 特殊功能暫存器的位元
sbit P00 = P0^0;  // P0 的第 0 位
sbit P07 = P0^7;  // P0 的第 7 位

void main() {
    clrbit = 0;  // 將 clrbit 值指定為 0
    setbit = 1;  // 將 setbit 值指定為 1
	loop:
    P00 = setbit;  // 將 P00 設定為 1
    P07 = clrbit;  // 將 P07 設定為 0
		Delay_ms(100);
	goto loop;
}