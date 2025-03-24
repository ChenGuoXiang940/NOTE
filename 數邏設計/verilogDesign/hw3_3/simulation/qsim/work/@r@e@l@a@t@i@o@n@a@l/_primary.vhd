library verilog;
use verilog.vl_types.all;
entity RELATIONAL is
    port(
        A               : in     vl_logic_vector(3 downto 0);
        B               : in     vl_logic_vector(3 downto 0);
        EQV             : out    vl_logic;
        NOT_EQV         : out    vl_logic;
        CEQV            : out    vl_logic;
        CNOT_EQV        : out    vl_logic
    );
end RELATIONAL;
