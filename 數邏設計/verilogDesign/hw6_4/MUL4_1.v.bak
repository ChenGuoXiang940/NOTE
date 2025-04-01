module MUL4_1(
    input [3:0]I,
    input [1:0]S,
    output reg F
);
    always @(I or S)
        case (S[1])
            1'b0:
                case (S[0])
                    1'b0    :F=I[0];
                    default :F=I[1];
                endcase
        default:
            case (S[0])
                'b0 :F=I[2];
                default :F=I[3];
            endcase
        endcase
endmodule