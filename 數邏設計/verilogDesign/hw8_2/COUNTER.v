module COUNTER(
    input CLK,
    input RESET,
    output reg [5:0] Q
);
    always @(posedge CLK or negedge RESET)
        if(!RESET)
            Q<=4'h0;
        else
            if(Q==4'h3c)
                Q<=4'h0;
        else
            Q<=Q+1'b1;
endmodule