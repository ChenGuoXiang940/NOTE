library verilog;
use verilog.vl_types.all;
entity LOGICAL is
    port(
        A               : in     vl_logic_vector(3 downto 0);
        B               : in     vl_logic_vector(3 downto 0);
        C               : in     vl_logic_vector(3 downto 0);
        NOT_OP          : out    vl_logic;
        AND_OP          : out    vl_logic;
        OR_OP           : out    vl_logic
    );
end LOGICAL;
