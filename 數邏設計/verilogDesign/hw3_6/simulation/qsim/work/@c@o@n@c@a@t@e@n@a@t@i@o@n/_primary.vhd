library verilog;
use verilog.vl_types.all;
entity CONCATENATION is
    port(
        A               : in     vl_logic_vector(7 downto 0);
        HIGH_BYTE       : in     vl_logic_vector(7 downto 0);
        LOW_BYTE        : in     vl_logic_vector(7 downto 0);
        SWAP            : out    vl_logic_vector(7 downto 0);
        LEFT            : out    vl_logic_vector(7 downto 0);
        RIGHT           : out    vl_logic_vector(7 downto 0);
        HIGH_NIBBLE     : out    vl_logic_vector(3 downto 0);
        LOW_BIBBLE      : out    vl_logic_vector(3 downto 0);
        WORD            : out    vl_logic_vector(15 downto 0)
    );
end CONCATENATION;
