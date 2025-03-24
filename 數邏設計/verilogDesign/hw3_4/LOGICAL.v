module LOGICAL(
	input [3:0]A,
	input [3:0]B,
	input [3:0]C,
	output NOT_OP,
	output AND_OP,
	output OR_OP);
	assign NOT_OP=!A;
	assign AND_OP=(A>B)&&(A<C);
	assign OR_OP=(A>B)||(A<C);
endmodule