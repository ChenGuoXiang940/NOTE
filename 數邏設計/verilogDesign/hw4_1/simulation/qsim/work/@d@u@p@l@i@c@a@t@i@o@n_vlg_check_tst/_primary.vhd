library verilog;
use verilog.vl_types.all;
entity DUPLICATION_vlg_check_tst is
    port(
        SIGN_EXTEND     : in     vl_logic_vector(15 downto 0);
        WORD            : in     vl_logic_vector(15 downto 0);
        sampler_rx      : in     vl_logic
    );
end DUPLICATION_vlg_check_tst;
