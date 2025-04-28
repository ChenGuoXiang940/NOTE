module test(
    input CLK,
    input RESET,
    output reg [7:0]SEGMENT
);
    wire [3:0] BCD;
    COUNTER A1 (.CLK(CLK),.RESET(RESET),.Q(BCD));
    BCD_SEVEN A2 (.BCD(BCD),.SEGMENT(SEGMENT));
endmodule