module test(
    input CLK,
    input RESET,
    output reg [7:0] Q
);
    always @(posedge CLK or negedge RESET)
        if (!RESET)
            Q <= 8'h01;
        else
            Q <= {Q[4:0], Q[7:5]};
endmodule