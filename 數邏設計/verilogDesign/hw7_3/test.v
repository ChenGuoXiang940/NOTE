module test(
    input CLK,
    input RESET,
    input [1:0] DIN,
    output reg [6:0] Q
);
    always @(posedge CLK or negedge RESET)
        if (!RESET)
            Q <= 7'h00;
        else
            Q <= (Q << 2) | DIN;
endmodule