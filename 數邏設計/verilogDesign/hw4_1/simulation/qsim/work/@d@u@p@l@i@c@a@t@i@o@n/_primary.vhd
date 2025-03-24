library verilog;
use verilog.vl_types.all;
entity DUPLICATION is
    port(
        A               : in     vl_logic_vector(7 downto 0);
        WORD            : out    vl_logic_vector(15 downto 0);
        SIGN_EXTEND     : out    vl_logic_vector(15 downto 0)
    );
end DUPLICATION;
