module test(
    input c0,
    input [3:0]x,
    input [3:0]y,
    output reg c4,
    output reg [3:0]s
);
    reg carry;
    integer i;
    always @(c0 or x or y or carry)
        begin
            carry=c0;
            for(i=0;i<4;i=i+1)
                begin
                    s[i]=x[i]^y[i]^carry;
                    carry=(x[i]&y[i])|(y[i]&carry)|(carry&x[i]);
                end
            c4=carry;
        end
endmodule