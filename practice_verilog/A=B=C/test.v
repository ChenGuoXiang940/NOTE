module test(
    input [2:0] A,  // 三位元輸入 A
    input [2:0] B,  // 三位元輸入 B
    input [2:0] C,  // 三位元輸入 C
    output F        // 當 A = B = C 時，輸出 F = 1
  );
  wire Y2, Y1, Y0;
  assign Y2 = (A[2] ~^ B[2]) & (A[2] ~^ C[2]);  // a2=b2=c2
  assign Y1 = (A[1] ~^ B[1]) & (A[1] ~^ C[1]);  // a1=b1=c1
  assign Y0 = (A[0] ~^ B[0]) & (A[0] ~^ C[0]);  // a0=b0=c0
  // 當且僅當 Y2, Y1, Y0 全為 1 時，F 才為 1
  assign F = Y2 & Y1 & Y0;
endmodule
