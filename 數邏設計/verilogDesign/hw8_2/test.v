module test(
    input CLK,
    input RESET,
    output reg [15:0]SEGMENT
);
    wire [7:0] BCD;
    COUNTER A1 (CLK,RESET,BCD);
    BCD_SEVEN A2 (BCD[3:0],SEGMENT[7:0]);
    BCD_SEVEN A3 (BCD[7:4],SEGMENT[15:8]);
endmodule