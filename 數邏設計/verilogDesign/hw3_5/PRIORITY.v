module PRIORITY(
	input A,
	input B,
	input C,
	input X,
	input Y,
	output F);
	assign F=(X==1'b1)?A:
				(Y==1'b1)?B:C;
endmodule