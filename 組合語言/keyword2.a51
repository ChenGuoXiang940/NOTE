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

KEYC:       MOV P0, #00001100B
            AJMP LOOP

KEYD:       MOV P0, #00001101B
            AJMP LOOP
KEYE:        MOV P0,#00001110B
            AJMP LOOP
KEYF:       MOV P0, #00001111B
            AJMP LOOP