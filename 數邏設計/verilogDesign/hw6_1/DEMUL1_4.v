module DEMUL1_4(
    input DIN,
    output [1:0]S,
    output reg [3:0]Y
);
    always @(DIN or S)
        begin
            if(S[1]==1'b0)
                if(S[0]==1'b0)
                    Y={3'b000,DIN};
                else
                    Y={2'b00,DIN,1'b0};
            else
                if(S[0]==1'b0)
                    Y={1'b0,DIN,2'b00};
                else
                    Y={DIN,3'b000};
        end
endmodule
