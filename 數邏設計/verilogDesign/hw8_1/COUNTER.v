module COUNTER(
    input CLK,
    input RESET,
    output reg [3:0] Q
);
    always @(posedge CLK or negedge RESET)
        if(!RESET)
            Q<=4'h0;
        else
            if(Q==4'h9)
                Q<=4'h0;
        else
            Q<=Q+1'b1;
endmodule