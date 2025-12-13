class Solution {

    static class Coupon {
        String code;
        String businessLine;

        Coupon(String code, String businessLine) {
            this.code = code;
            this.businessLine = businessLine;
        }
    }

    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {

        Set<String> validBusiness = new HashSet<>(
            Arrays.asList("restaurant", "grocery", "pharmacy", "electronics")
        );

        List<Coupon> coupons = new ArrayList<>();

        for (int i = 0; i < code.length; i++) {

            String s = code[i];

            // empty check
            if (s.isEmpty()) continue;

            // character validation
            boolean valid = true;
            for (char ch : s.toCharArray()) {
                if (ch != '_' && !Character.isLetterOrDigit(ch)) {
                    valid = false;
                    break;
                }
            }

            if (valid && isActive[i] && validBusiness.contains(businessLine[i])) {
                coupons.add(new Coupon(s, businessLine[i]));
            }
        }

        // SORT: first by businessLine, then by code
        coupons.sort((a, b) -> {
            int cmp = a.businessLine.compareTo(b.businessLine);
            if (cmp != 0) return cmp;
            return a.code.compareTo(b.code);
        });

        List<String> result = new ArrayList<>();
        for (Coupon c : coupons) {
            result.add(c.code);
        }

        return result;
    }
}
