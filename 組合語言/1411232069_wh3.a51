            ORG 0000H
LOOP:       MOV P1, #11111110B  

            ; 第一組按鍵
            JB   P2.0, CONT0    ; 若 P2.0 = 1，則不進入 KEY0
            LJMP KEY0           ; 若 P2.0 = 0，則跳到 KEY0
CONT0:      JB   P2.1, CONT1
            LJMP KEY1
CONT1:      JB   P2.2, CONT2
            LJMP KEY2
CONT2:      JB   P2.3, CONT3
            LJMP KEY3
CONT3:      
            MOV P1, #11111101B  

            ; 第二組按鍵
            JB   P2.0, CONT4
            LJMP KEY4
CONT4:      JB   P2.1, CONT5
            LJMP KEY5
CONT5:      JB   P2.2, CONT6
            LJMP KEY6
CONT6:      JB   P2.3, CONT7
            LJMP KEY7
CONT7:
            MOV P1, #11111011B  

            ; 第三組按鍵
            JB   P2.0, CONT8
            LJMP KEY8
CONT8:      JB   P2.1, CONT9
            LJMP KEY9
CONT9:      JB   P2.2, CONTA
            LJMP KEYA
CONTA:      JB   P2.3, CONTB
            LJMP KEYB
CONTB:
            MOV P1, #11110111B  

            ; 第四組按鍵
            JB   P2.0, CONTC
            LJMP KEYC
CONTC:      JB   P2.1, CONTD
            LJMP KEYD
CONTD:      JB   P2.2, CONTE
            LJMP KEYE
CONTE:      JB   P2.3, CONTF
            LJMP KEYF
CONTF:
            AJMP LOOP

;-------------------------------
; KEY 子程式
;-------------------------------

KEY0:       MOV P0, #00000000B
            AJMP LOOP

KEY1:       MOV P0, #00000001B
            AJMP LOOP

KEY2:       MOV P0, #00000010B
            AJMP LOOP

KEY3:       MOV P0, #00000011B
            AJMP LOOP

KEY4:       MOV P0, #00000100B
            AJMP LOOP

KEY5:       MOV P0, #00000101B
            AJMP LOOP

KEY6:       MOV P0, #00000110B
            AJMP LOOP

KEY7:       MOV P0, #00000111B
            AJMP LOOP

KEY8:       MOV P0, #00001000B
            AJMP LOOP

KEY9:       MOV P0, #00001001B
            AJMP LOOP

KEYA:       MOV P0, #00001010B
            AJMP LOOP

KEYB:       MOV P0, #00001011B
            AJMP LOOP

KEYC:       MOV P0, #11000000B
            ACALL DELAY
            MOV P0, #00000000B
            ACALL DELAY
            MOV P0, #11000000B
            ACALL DELAY
            MOV P0, #00000000B
            ACALL DELAY
            MOV P0, #11000000B
		 ACALL DELAY
            MOV P0, #00000000B
            ACALL DELAY
            AJMP LOOP

KEYD:       MOV R0, #OK-TABLE+1
            MOV DPTR, #TABLE
            MOV R1, #00H
LOOPD:      MOV A, R1
            MOVC A, @A+DPTR
            MOV P0, A
            ACALL DELAY
            INC R1
            DJNZ R0, LOOPD
            AJMP LOOP

TABLE:      DB 10000100B, 10000100B, 10000100B, 10000100B
            DB 10000100B, 10000100B, 10000000B, 10001000B
            DB 10000000B, 10001000B, 10000000B, 10001000B
            DB 10010000B, 00110000B, 00110000B, 00110000B
            DB 00110000B, 00110000B, 00110000B, 01010000B
            DB 00010000B, 01010000B, 00010000B, 01010000B
OK:         DB 00010000B

KEYE:       MOV R1, #08H
            MOV A, #00000001B
LEFT:       MOV P0, A
            ACALL DELAY
            RL   A
            DJNZ R1, LEFT

            MOV R1, #08H
            MOV A, #10000000B
RIGHT:      MOV P0, A
            ACALL DELAY
            RR   A
            DJNZ R1, RIGHT
            AJMP LOOP

KEYF:       MOV P0, #11111111B
            ACALL DELAY
            MOV P0, #00000000B
            ACALL DELAY
            MOV P0, #11111111B
            ACALL DELAY
            MOV P0, #00000000B
            ACALL DELAY
            MOV P0, #11111111B
            ACALL DELAY
            MOV P0, #00000000B
            ACALL DELAY
            AJMP LOOP

;-------------------------------
; 延遲子程式
;-------------------------------

DELAY:      MOV R5, #2
DL1:        MOV R6, #250
DL2:        MOV R7, #200
DL3:        DJNZ R7, DL3
            DJNZ R6, DL2
            DJNZ R5, DL1
            RET

            END
