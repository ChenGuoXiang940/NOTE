module test(
    input [8:0]I,
    output reg pe
);
    integer j;
    always @(I)
        begin
            pe=1'b0;
            j=1;
            while(j<9)
                begin
                    pe=pe^I[j];
                    j=j+1;
                end
        end
endmodule