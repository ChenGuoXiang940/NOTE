module CONCATENATION(
	input [7:0]A,
	input [7:0]HIGH_BYTE,
	input [7:0]LOW_BYTE,
	output [7:0]SWAP,
	output [7:0]LEFT,
	output [7:0]RIGHT,
	output [3:0]HIGH_NIBBLE,
	output [3:0]LOW_BIBBLE,
	output [15:0]WORD);
	assign SWAP = {A[0], A[1], A[2], A[3], A[4], A[5], A[6], A[7]};
   assign RIGHT = {A[0], A[7:1]};  // 右循環移位
   assign LEFT = {A[6:0], A[7]};   // 左循環移位
   assign WORD = {HIGH_BYTE, LOW_BYTE};  // 16-bit 組合
   assign HIGH_NIBBLE = HIGH_BYTE[7:4];  // 取高 4-bit
   assign LOW_NIBBLE = HIGH_BYTE[3:0];   // 取低 4-bit
endmodule